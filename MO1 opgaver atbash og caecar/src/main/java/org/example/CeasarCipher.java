package org.example;

public class CeasarCipher extends AbstractCipher {
    private int rotFactor;

    CeasarCipher(int i) {
        if (i <= ALPHABETH.length || i >= 0) {
            this.rotFactor = i;
        } else {
            rotFactor = 0;
        }
    }

    @Override
    public String encrypt(String message) {
        String tempVar = "";

        for (int i = 0; i < message.length(); i++) {
            if (findCharIndex(message.charAt(i)) == -1) {
                tempVar += message.charAt(i);
            }
            else {
                int index = findCharIndex(message.charAt(i)) + rotFactor;
                tempVar += ALPHABETH[index % ALPHABETH.length];
            }
        }
        return tempVar;
    }

    @Override
    public String decrypt(String encrypted) {
        String tempVar = "";

        for (int i = 0; i < encrypted.length(); i++) {
            if (findCharIndex(encrypted.charAt(i)) == -1) {
                tempVar += encrypted.charAt(i);
            }
            else {
                int index = findCharIndex(encrypted.charAt(i)) + (ALPHABETH.length - rotFactor);
                tempVar += ALPHABETH[index % ALPHABETH.length];
            }
        }
        return tempVar;
    }
    }