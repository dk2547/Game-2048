package org.sameer.project2048;

import java.util.Random;
import java.util.Scanner;

public class Activity {
	static Random rn = new Random();
	// / to initialize array
	static void entry(int arr[][]) {
		
		int a1 = rn.nextInt(4);
		int b1 = rn.nextInt(4);
		int a2, b2;
		while (true) {
			a2 = rn.nextInt(4);
			b2 = rn.nextInt(4);
			if (a1 != a2 || b1 != b2)
				break;
		}
		arr[a1][b1] = 2;
		arr[a2][b2] = 2;

	}

	/// to display array
	static void display(int arr[][]) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				/*if(arr[i][j]<10)
					System.out.print("000");
				else if(arr[i][j]<100)
					System.out.print("00");
				else if(arr[i][j]<1000)
					System.out.print("0");*/
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	////
	// down arrow activity

	static void downArrow(int arr[][]) {
//to sum same digits
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j <= 3; j++) {
				if (arr[i][j] != 0) {
					for (int k = i - 1; k >= 0; k--) {
						if (arr[i][j] == arr[k][j]) {
							arr[i][j] = (arr[i][j]) * 2;
							arr[k][j] = 0;
							break;
						}
						else if(arr[i][j] != arr[k][j] && arr[k][j]!=0)
							break;
					}
				}
			}
		}
		// to swipe down
		for(int i=3;i>=0;i--) {
			for(int j=0;j<=3;j++) {
				if(arr[i][j]==0) {
					for(int k=i;k>=0;k--) {
						if(arr[k][j]!=0) {
							arr[i][j]=arr[k][j];
							arr[k][j]=0;
							break;
						}
					}
				}
			}
		}
	
	}
	
	
/// to generate a 2 or 4 at random place
	static void randomGenerator(int arr[][]) {
		
		
		while(true) {
			int a = rn.nextInt(4);
			int b = rn.nextInt(4);
			if(arr[a][b]==0) {
				arr[a][b]=2;
				break;}
			else
				continue;
		}	
	}
	
	
	
	////
		// up arrow activity

		static void upArrow(int arr[][]) {
	//to sum same digits
			for (int i = 0; i <=3 ; i++) {
				for (int j = 0; j <= 3; j++) {
					if (arr[i][j] != 0) {
						for (int k = i + 1; k <=3 ; k++) {
							if (arr[i][j] == arr[k][j]) {
								arr[i][j] = (arr[i][j]) * 2;
								arr[k][j] = 0;
								break;
							}
							else if(arr[i][j] != arr[k][j] && arr[k][j]!=0)
								break;
						}
					}
				}
			}
			// to swipe up
			for(int i=0;i<=3;i++) {
				for(int j=0;j<=3;j++) {
					if(arr[i][j]==0) {
						for(int k=i;k<=3;k++) {
							if(arr[k][j]!=0) {
								arr[i][j]=arr[k][j];
								arr[k][j]=0;
								break;
							}
						}
					}
				}
			}
		
		}
	

		
		
		
		
		////
				// left arrow activity

				static void leftArrow(int arr[][]) {
			//to sum same digits
					for (int i = 0; i <=3 ; i++) {
						for (int j = 0; j <= 3; j++) {
							if (arr[j][i] != 0) {
								for (int k = i + 1; k <=3 ; k++) {
									if (arr[j][i] == arr[j][k]) {
										arr[j][i] = (arr[j][k]) * 2;
										arr[j][k] = 0;
										break;
									}
									else if(arr[j][i] != arr[j][k] && arr[j][k]!=0)
										break;
								}
							}
						}
					}
					// to swipe left
					for(int i=0;i<=3;i++) {
						for(int j=0;j<=3;j++) {
							if(arr[j][i]==0) {
								for(int k=i;k<=3;k++) {
									if(arr[j][k]!=0) {
										arr[j][i]=arr[j][k];
										arr[j][k]=0;
										break;
									}
								}
							}
						}
					}
				}
				
				
				
				
				
				////
				// right arrow activity

				static void rightArrow(int arr[][]) {
			//to sum same digits
					for (int i = 3; i >=0 ; i--) {
						for (int j = 0; j <= 3; j++) {
							if (arr[j][i] != 0) {
								for (int k = i - 1; k >=0 ; k--) {
									if (arr[j][i] == arr[j][k]) {
										arr[j][i] = (arr[j][k]) * 2;
										arr[j][k] = 0;
										break;
									}
									else if(arr[j][i] != arr[j][k] && arr[j][k]!=0)
										break;
								}
							}
						}
					}
					// to swipe left
					for(int i=3;i>=0;i--) {
						for(int j=0;j<=3;j++) {
							if(arr[j][i]==0) {
								for(int k=i;k>=0;k--) {
									if(arr[j][k]!=0) {
										arr[j][i]=arr[j][k];
										arr[j][k]=0;
										break;
									}
								}
							}
						}
					}
				}

	

				
				
				
				
}