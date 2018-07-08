package org.sameer.project2048;

import java.util.Scanner;

public class Test {
	static int arr[][] = new int[4][4];
public static void main(String[] args) {
	Activity.entry(arr);
	Scanner sc = new Scanner(System.in);
	while(true) {
	Activity.display(arr);
	
	int flag=sc.next().charAt(0);
	if(flag=='w')
		Activity.upArrow(arr);
	if(flag=='s')
		Activity.downArrow(arr);
	if(flag=='a')
		Activity.leftArrow(arr);
	if(flag=='d')
		Activity.rightArrow(arr);
	
	if(flag==0) {
		System.out.println("exit");
	break;}
	else {
		
	Activity.randomGenerator(arr);
	continue;
	}}
	Activity.display(arr);
}
}
