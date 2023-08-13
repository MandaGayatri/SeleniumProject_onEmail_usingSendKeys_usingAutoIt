# SeleniumProject_onEmail_usingSendKeys_usingAutoIt
### Project Structure
![Settings Window](https://github.com/MandaGayatri/SeleniumProject_onEmail_usingSendKeys_usingAutoIt/blob/main/email.PNG)
### In this project to upolad the the files using AutoIt we have to download the following AutoIt tools to upolad a file.
## 1)To download AutoIt : https://www.autoitscript.com/site/autoit/downloads/#google_vignette
## 2)To download AutoIt ScriptEditor : https://www.autoitscript.com/site/autoit-script-editor/downloads/

### Overview of the Project

This project centers around automating key functionalities of the Gmail application, enhancing efficiency and accuracy in testing. I successfully streamlined the sign-in process, allowing seamless access to user accounts. The automation extends to composing emails, where  both traditional "sendkeys" input and advanced AutoIt scripts for attaching files.  Finally, the automation concludes with a smooth logout procedure, maintaining the project's comprehensive testing scope.


### Table of contents:
### 1)BaseClass
#### The base class incorporates three essential functions: 
"readConfigFile," "launchApp," and "quit." The "readConfigFile" method enables seamless access to configuration parameters, ensuring uniformity across all test cases. Meanwhile, the "launchApp" function orchestrates the initialization of the application under test. The "quit" method managing clean application shutdown and resource release.
### 2)PageObjectClass
  Page Object Model is writtern for the Gmail application, creating a clear guide for writing tests that interact with Gmail's buttons, forms, and features. This helps testers write efficient and understandable scripts for tasks like sending emails or managing the inbox.
### 3)RunnerClass
 It orchestrates both conventional input using "sendkeys" and advanced automation through AutoIt. This dual approach allows for flexible testing, catering to different scenarios. The "sendkeys" procedure inputs data like a human user, while the AutoIt test procedure automates complex actions or interacts with non-standard UI elements.
### 4)XLSheetData
In this automation framework, I incorporated essential functions to efficiently interact with Excel data. "getCell","getRow","getCellData","setCellData" functions collectively enhance our testing capabilities by providing seamless access and manipulation of Excel data, contributing to the effectiveness and precision of the automated tests.
### 5)DataDrivenTest for GmailPage
Incorporating data-driven testing into our Gmail page automation empowers us to conduct comprehensive and versatile testing scenarios. By dynamically supplying various sets of data, such as different email addresses we can assess how the Gmail page responds under different conditions. 
### 6)Parallel Execution and CrossBroswer Execution
Parallel execution and cross-browser execution are two essential strategies that optimize the efficiency and effectiveness of our testing endeavors. Parallel execution involves running multiple test cases simultaneously on different threads and   cross-browser execution ensures that our web application functions seamlessly across various browsers such as Chrome, Firefox, and InternetExplorer.



