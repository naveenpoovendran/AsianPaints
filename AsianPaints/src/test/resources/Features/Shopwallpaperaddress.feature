Feature: Shop and add address on asianpaints

Scenario Outline: User purchases Wallsticker and adds address

Given User is on AP homepage 
When User logs in with contact number and OTP
And User selects shop 
And User clicks on wallsticker in shop
And User selects size 
And User clicks favourite wallsticker
And User input pincode and clicks buy now
And User selects address and adds address
And User enters same <Name> and <Mobile> and <Pincode> and <Flat> and <Street> and <Landmark> and <City>
And User clicks on save address
Then user should not able to save it

Examples:
|Name     |Mobile    |Pincode     |Flat       |Street     |Landmark       |City       |    
#|naveen   |9958515619|110092      |123        |abc        |cde            |delhi      |     #saves same address
#|naveen   |9958515619|110092      |123        |abc        |cde            |delhi      |     #saves same address
|123@$      |9958515619|110092      |12345678911|12345678911|12345678911    |12345678911|     #adds invalid data