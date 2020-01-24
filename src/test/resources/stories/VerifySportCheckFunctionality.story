Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: User is able to see the burger menu items

!-- Given user opened site, using next url: 'https://www.sportchek.ca/'
!-- When user clicks burger menu button
!-- Then following menu items are displayed: 'Deals & Features, Men, Women, Kids, Footwear, Gear, Electronics, Jerseys & Fan Wear, Vitamins & Supplements, Brand'

Scenario: User is able to see message of empty card

Given opening site with next url: 'https://www.sportchek.ca/'
When user hovers card icon
Then following message are displayed: 'Your Shopping Cart Is Currently Empty.'