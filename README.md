# Shares-Profit-Calculator-App

USE: 
- This Java program calculates the profit when selling shares that are bought on different prices.

INFO: 
- It checks buying and selling of shares from a txt file that has the following format:

buy 50 price 25

buy 40 price 22

buy 30 price 33

sell 110 price 30

buy 25 price 35

sell 30 price 40

- If selling more shares than I have it shows error
- WARNING! Format must strictly have the form above

HOW TO RUN: 
- Intellij:

You have to pass the HTML file as an argument on the main method: Run -> Edit Configurations -> + -> Application -> Give a name -> Give main class name (NetBenefit) -> Give program arguments (shares_trade_file.txt) -> OK 

File "shares_trade_file.txt" has to be in project file (outside of src file) 

- CMD: 

"shares_trade_file.txt" file must be in src folder

Go to java files folder through cmd navigation ( cd ) -> javac *.java -> java TagMatching test_html_file.html


![Screenshot_2](https://user-images.githubusercontent.com/48126722/182368153-fa93d163-bdcb-4454-a484-b3605c7dedc0.png)






Running on: jdk-11.0.11
