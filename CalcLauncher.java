//Maria Boichenko

package com.company.calculator;
import java.awt.EventQueue;

public class CalcLauncher {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Calculator();
			}
		});
	}
}
