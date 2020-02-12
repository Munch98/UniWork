package com.mycompany.opgave1;

public class CeasarCipher extends AbstractCipher {

    int rotFactor;

    CeasarCipher(int rotFactor) {
        this.rotFactor = rotFactor;

    }

    @Override
    public String encrypt(String message) {
        String ret = "";
        for (int i = 0; i < message.length(); i++) {
            if (findCharIndex(message.charAt(i)) == -1) {
                ret += message.charAt(i);

            } else {
                int index = findCharIndex(message.charAt(i)) + rotFactor;
                ret += ALPHABETH[index % ALPHABETH.length];
            }

        }

        return ret;
    }

    @Override
    public String decrypt(String encrypted) {
        String ret = "";
        for (int i = 0; i < encrypted.length(); i++) {
            if (findCharIndex(encrypted.charAt(i)) == -1) {
                ret += encrypted.charAt(i);

            } else {
                int index = findCharIndex(encrypted.charAt(i)) + (ALPHABETH.length - rotFactor);
                ret += ALPHABETH[index % ALPHABETH.length];
            }

        }

        return ret;
    }

}
