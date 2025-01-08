# Purpose

Basic project to show memory leak when using selenium 4.28.0 with `PageFactory.initElements(AppiumFieldDecorator)`.

| Selenium v | initElements           | Result |
|------------|------------------------|--------|
| 4.25.0     | default                | ✅      |
| 4.25.0     | Appium Field Decorator | ✅      |
| 4.28.0     | default                | ✅      |
| 4.28.0     | Appium Field Decorator | Leaks  |

## Running

Run the repeated test in [MemoryTest](src/test/java/MemoryTest.java).

## Config

Change the `org.seleniumhq.selenium.version` version in [Maven](pom.xml).

Change the PageFactory.initElements() between default and AppiumFieldDecorator in [Page](src/test/java/pages/Page.java).