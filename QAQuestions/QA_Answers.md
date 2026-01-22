\# QA Assessment Questions \& Answers



\## Question 1:

\*\*What are the advantages of automating tests using a Page Object Model (POM)?\*\*



\*\*Answer:\*\*  

\- Improves \*\*code readability\*\* and \*\*maintainability\*\*.  

\- Reduces \*\*code duplication\*\* by keeping page locators and actions in one place.  

\- Makes tests more \*\*scalable\*\* and easier to update if UI changes.  



---



\## Question 2:

\*\*When would you avoid automating a test case?\*\*



\*\*Answer:\*\*  

\- When the test case is \*\*run very infrequently\*\*.  

\- When the functionality \*\*changes frequently\*\*.  

\- For \*\*UI elements that are difficult to automate\*\* or \*\*require human judgment\*\*.  



---



\## Question 3:

\*\*What typically causes flaky tests, and how would you reduce flakiness?\*\*



\*\*Answer:\*\*  

\*\*Causes of flaky tests:\*\*  

\- Timing issues (elements not ready).  

\- Dependencies on external systems (API or DB delays).  

\- Test order dependencies.  

\*\*How to reduce flakiness:\*\*  

\- Use \*\*explicit waits\*\* instead of fixed delays.  

\- Isolate tests to avoid dependencies.  

\- Mock or stub external systems when possible.  



---



\## Question 4:

\*\*What is the difference between UI tests and API tests, and when is each more suitable?\*\*



\*\*Answer:\*\*  

\- \*\*UI Tests:\*\* Test the user interface and end-to-end functionality. Suitable for \*\*user workflows\*\*.  

\- \*\*API Tests:\*\* Test backend endpoints directly. Suitable for \*\*functional logic, data validation, and faster execution\*\*.  



---



\## Question 5:

\*\*What is the difference between implicit and explicit waits, and in which scenarios should each be used?\*\*



\*\*Answer:\*\*  

\- \*\*Implicit Wait:\*\* Waits a \*\*fixed time\*\* for elements to appear. Used when \*\*all elements may take some time to load\*\*.  

\- \*\*Explicit Wait:\*\* Waits for a \*\*specific condition\*\* for a specific element. Used for \*\*dynamic elements or specific conditions\*\*.  



---



\## Question 6:

\*\*Name three common exceptions and explain when each one occurs.\*\*



\*\*Answer:\*\*  

1\. \*\*NoSuchElegit add .

mentException\*\* – Occurs when the element cannot be found on the page.  

2\. \*\*StaleElementReferenceException\*\* – Occurs when the element is no longer attached to the DOM.  

3\. \*\*TimeoutException\*\* – Occurs when an explicit wait condition is not met within the timeout period.  



