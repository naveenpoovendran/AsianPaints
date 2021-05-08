Feature: Shop on asian paints

Scenario: User purchases wallsticker from Asianpaints 
Given User is on homepage 
When User logs in with mobile number and OTP
And User user navigates to shop 
And User clicks on wallsticker
And User clicks on size 
And User Selects favourite wallsticker
And User enters pincode and clicks buy now
And User selects address and clicks on continue 
And User clicks on pay now 
Then User Should see Payment page 