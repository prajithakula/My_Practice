/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code;

import java.math.BigDecimal;

/**
 *
 * @author hp
 */
public class T1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(BigDecimal i = new BigDecimal("10"); i.compareTo(new BigDecimal("0")) != 0; i = i.subtract(new BigDecimal("0.1"))){
	          System.out.println(i);
	        }
	}
}
