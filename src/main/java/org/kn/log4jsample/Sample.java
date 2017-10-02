/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kn.log4jsample;

import org.apache.log4j.Logger;

/**
 *
 * @author xtecuan
 */
public class Sample {

    public static final Logger LOGGER = Logger.getLogger(Sample.class);

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            LOGGER.info("Message " + i);
        }
    }
}
