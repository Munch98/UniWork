/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.opgave1;

/**
 *
 * @author xps
 */
public class AtbashCipher extends AbstractCipher {

    @Override
    public String encrypt(String message) {
        String ret = "";

        for (int i = 0; i < message.length(); i++) {
            if (findCharIndex(message.charAt(i)) != -1) {
                int index = ALPHABETH.length - 1 - findCharIndex(message.charAt(i));
                ret += ALPHABETH[index];

            } else {
                ret += message.charAt(i);

            }

        }
        return ret;
    }

    @Override
    public String decrypt(String encrypted) {
        String ret = "";

        for (int i = 0; i < encrypted.length(); i++) {
            if (findCharIndex(encrypted.charAt(i)) != -1) {
                int index = ALPHABETH.length - 1 - findCharIndex(encrypted.charAt(i));
                ret += ALPHABETH[index];

            } else {
                ret += encrypted.charAt(i);

            }

        }
        return ret;
    }
}
