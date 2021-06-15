package com.ibm.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.ibm.Country;
import com.ibm.State;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		List<String> countryStateList = new ArrayList<String>();

		// Hold the country names
		Set<String> set = new LinkedHashSet<String>();

		System.out.println("Enter how many countries want to enter");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter country|state name");
			String countryStateCapitalPair = sc.next();

			countryStateList.add(countryStateCapitalPair);
			// Splitting the input string on the basis of '|' as delimiter

			String[] array = countryStateCapitalPair.split("\\|");

			set.add(new String(array[0]));
		}

		List<Country> countryList = new ArrayList<Country>();
		for (String country : set) {
			List<State> stateList = new ArrayList<State>();
			for (String countryState : countryStateList) {
				String[] array2 = countryState.split("\\|");
				if (country.equalsIgnoreCase(array2[0])) {
					stateList.add(new State(array2[1]));
				}
			}
			Country cntr = new Country(country, stateList);
			countryList.add(cntr);
		}
		System.out.println("Countries and States in ascending order\r\n" + "");
		Collections.sort(countryList);
		for (Country cntry : countryList) {
			System.out.println(cntry.getName());
			Collections.sort(cntry.getStateList());
			for (State st : cntry.getStateList()) {
				System.out.println("--" + st.getName());
			}
		}

	}

}
