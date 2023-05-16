# Security_Package_API_Spring_boot

The project consists of a Java Spring Boot application that provides API endpoints for encryption and decryption using different ciphers. It includes the following components:

1. Ciphers: The application includes classes that implement different encryption algorithms, namely Caesarchiper, VigenereChiper, SubstitutionChiper, and PlayfairChiper. These classes contain methods for encrypting and decrypting messages based on their respective algorithms.

2. API Endpoints: The application exposes several POST endpoints for performing encryption and decryption operations. Each endpoint accepts a JSON payload containing a message and a key. The payload is deserialized into the Message class, which has text and key attributes.

    - /caesar/encrypt: Accepts a Message object and encrypts the message using the Caesar cipher with the provided key.
    - /caesar/decrypt: Accepts a Message object and decrypts the message using the Caesar cipher with the provided key.
    - /vigenere/encrypt: Accepts a Message object and encrypts the message using the Vigenere cipher with the provided key.
    - /vigenere/decrypt: Accepts a Message object and decrypts the message using the Vigenere cipher with the provided key.
    - /substitution/encrypt: Accepts a Message object and encrypts the message using the Substitution cipher with the provided key.
    - /substitution/decrypt: Accepts a Message object and decrypts the message using the Substitution cipher with the provided key.
    - /playfair/encrypt: Accepts a Message object and encrypts the message using the Playfair cipher with the provided key.
    - /playfair/decrypt: Accepts a Message object and decrypts the message using the Playfair cipher with the provided key.
3. Main Class: The DemoApplication class serves as the entry point for the Spring Boot application. It contains the main method, which bootstraps the application using SpringApplication.run.

4. To test the API endpoints using Postman, you can send POST requests to the corresponding URLs with the appropriate payload in JSON format. The payload should include the text and key attributes for the desired encryption or decryption operation. Make sure to set the Content-Type header to application/json in your requests.
