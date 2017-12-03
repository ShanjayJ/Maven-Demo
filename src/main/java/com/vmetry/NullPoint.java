package com.vmetry;

import java.util.ArrayList;

public class NullPoint {
	public static ArrayList Initilizer(int a) {
		ArrayList list;
		if (a == 0) {
			list = new ArrayList();
		} else {
			list = null;
		}
		return list;

	}

}
