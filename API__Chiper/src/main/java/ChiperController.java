import org.springframework.boot.SpringApplication;

import com.geekscript.algorithm_chiper2022.Abstract;
import com.geekscript.algorithm_chiper2022.Caesarchiper;
import com.geekscript.algorithm_chiper2022.PlayfairChiper;
import com.geekscript.algorithm_chiper2022.SubstitutionChiper;
import com.geekscript.algorithm_chiper2022.VigenereChiper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
@SpringBootApplication
@RestController
public class ChiperController {
    @PostMapping("/encrypt")
    public String encrypt(@RequestParam("cipher") String cipherType,
                          @RequestParam("message") String message,
                          @RequestParam("key") String key) {
        Abstract cipher = null;

        switch (cipherType) {
            case "Caesar":
                cipher = new Caesarchiper();
                break;
            case "Vigenere":
                cipher = new VigenereChiper();
                break;
            case "Substitution":
                cipher = new SubstitutionChiper();
                break;
            case "Playfair":
                cipher = new PlayfairChiper(key);
                break;
            default:
                return "Invalid cipher type!";
        }

        return cipher.encrypt(message, key);
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestParam("cipher") String cipherType,
                          @RequestParam("message") String message,
                          @RequestParam("key") String key) {
        Abstract cipher = null;

        switch (cipherType) {
            case "Caesar":
                cipher = new Caesarchiper();
                break;
            case "Vigenere":
                cipher = new VigenereChiper();
                break;
            case "Substitution":
                cipher = new SubstitutionChiper();
                break;
            case "Playfair":
                cipher = new PlayfairChiper(key);
                break;
            default:
                return "Invalid cipher type!";
        }

        return cipher.decrypt(message, key);
    }
    
}
