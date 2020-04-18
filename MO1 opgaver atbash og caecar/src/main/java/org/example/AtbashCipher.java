package org.example;

public class AtbashCipher extends AbstractCipher {

    @Override
    public String encrypt(String original) {
        String encryptMessage = "";
        for (int i = 0; i < original.length(); i++) {
            if (findCharIndex(original.charAt(i)) != -1) {
                int index = ALPHABETH.length - 1 - findCharIndex(original.charAt(i));
                encryptMessage += ALPHABETH[index];
            } else encryptMessage += original.charAt(i);

        }

        return encryptMessage;
    }


    @Override
    public String decrypt(String encrypted) {
        return (encrypt(encrypted));
    }
}
