package com.xyz.practice;
   





//space added in QA


public class BrowserTesting {

	public static void main(String[] args) {
		
				// step-1 register the driver
				// webdriver.chrome.driver =
				
				System.setProperty("webdriver.chrome.driver", "E:\\23 feb batch workspace\\AutomationTesting\\Resources\\chromedriver.exe");
				
		        // step-2
				// we have to create object of chrome
				
				ChromeDriver obj = new ChromeDriver ();
				 // step 3
				// enter url
				obj.get("https://demoqa.com/text-box");
			}

		
	}


