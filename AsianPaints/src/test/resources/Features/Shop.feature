Feature: Shop on asian paints

Scenario: User purchases wall stickers from Asianpaints 
Given User is on homepage 
When User logs in with mobile number and OTP
And User navigates to shop 
And User clicks on wallstickers
And User clicks on size and selects large 
And User Selects favourite wallstickers
And User enters pincode and clicks buy now
And User selects address and clicks on continue 
And User clicks on pay now 
Then User Should see Payment page 