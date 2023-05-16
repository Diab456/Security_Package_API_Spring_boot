package com.example.demo;

import com.geekscript.algorithm_chiper2022.Abstract;
import com.geekscript.algorithm_chiper2022.Caesarchiper;
import com.geekscript.algorithm_chiper2022.PlayfairChiper;
import com.geekscript.algorithm_chiper2022.SubstitutionChiper;
import com.geekscript.algorithm_chiper2022.VigenereChiper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class DemoApplication {
    
    
    
    
    @PostMapping("/caesar/encrypt")
    public String encrypt(@RequestBody Message message) {
        Caesarchiper cipher = new Caesarchiper();
        return cipher.encrypt(message.getText(), message.getKey());
    }

    @PostMapping("/caesar/decrypt")
    public String decrypt(@RequestBody Message message) {
        Caesarchiper cipher = new Caesarchiper();
        return cipher.decrypt(message.getText(), message.getKey());
    }
    
    
    @PostMapping("/vigenere/encrypt")
    public String vigenereEncrypt(@RequestBody Message message) {
        VigenereChiper cipher = new VigenereChiper();
        return cipher.encrypt(message.getText(), message.getKey());
    }
    
    
    @PostMapping("/vigenere/decrypt")
    public String vigenereDecrypt(@RequestBody Message message) {
        VigenereChiper cipher = new VigenereChiper();
        return cipher.decrypt(message.getText(), message.getKey());
    }
    
    
    @PostMapping("/substitution/encrypt")
    public String substitutionEncrypt(@RequestBody Message message) {
        SubstitutionChiper cipher = new SubstitutionChiper();
        return cipher.encrypt(message.getText(), message.getKey());
    }
    
    @PostMapping("/substitution/decrypt")
    public String substitutionDecrypt(@RequestBody Message message) {
        SubstitutionChiper cipher = new SubstitutionChiper();
        return cipher.decrypt(message.getText(), message.getKey());
    }
    
    @PostMapping("/playfair/encrypt")
    public String playfairEncrypt(@RequestBody Message message) {
        PlayfairChiper cipher = new PlayfairChiper(message.getKey());
        return cipher.encrypt(message.getText() , "");
    }
        
    @PostMapping("/playfair/decrypt")
    public String playfairDecrypt(@RequestBody Message message) {
        PlayfairChiper cipher = new PlayfairChiper(message.getKey());
        return cipher.decrypt(message.getText(), "");
    }
    
    

    public static class Message {
        private String text;
        private String key;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
