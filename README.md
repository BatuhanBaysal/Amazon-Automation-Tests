# amazon-automation-tests
TR - Proje Açıklaması
Bu proje, Amazon.com.tr web sitesinde otomasyon testleri gerçekleştirmek için tasarlanmıştır. Selenium WebDriver kullanarak, bir Java programlama dili kullanılarak yazılmıştır. Bu otomasyon testleri, Amazon.com.tr web sitesinin belirli işlevlerini otomatik olarak test etmek ve doğrulamak için kullanılabilir. Örneğin, otomasyon testleri, web sitesindeki belirli düğmelere tıklamak, metin girişi yapmak, belirli bir metni doğrulamak ve belirli bir süre içinde belirli bir öğenin görünürlüğünü kontrol etmek gibi işlevleri gerçekleştirebilir. Bu tür bir otomasyon testi, geliştirme sürecinde kalite kontrolünü artırmak ve web sitesinin istikrarını sağlamak için kullanılır.
Bu Maven projesi, Amazon.com.tr üzerinde otomasyon testleri gerçekleştirmek için IntelliJ IDEA'de tasarlanmıştır. Projenin ana bileşenleri ve versiyonları şu şekildedir:
- JUnit Jupiter API (5.10.2): Java tabanlı testleri yazmak için kullanılan bir test çerçevesidir.
- JUnit (4.13.2): JUnit Jupiter API'nin eski bir sürümüdür. Proje, eski JUnit sürümünü içerirken, test yazılımında JUnit Jupiter API'ye geçiş yapılabilir.
- Selenium Java (4.20.0): Web uygulamalarını test etmek için kullanılan bir otomasyon aracıdır. Proje, Selenium'un Java sürümünü kullanarak web tarayıcıları üzerinde testler yapmayı sağlar.
- Maven Compiler Plugin (3.13.0): Maven projesinin derleme ayarlarını yapılandırmak için kullanılır. Proje, Java kodunu derlemek ve çalıştırmak için Maven Compiler Plugin'i yapılandırır.
Projede ayrıca Java'nın UTF-8 karakter kodlaması kullanılmaktadır. Derleme ve hedef JDK sürümü olarak Java 22 kullanılmıştır. Bu Maven projesi, Amazon.com.tr'nin test otomasyonunu gerçekleştirmek için gerekli olan temel araçları sağlar ve bu araçların belirli sürümlerini kullanır.

Projede kullanılan ana araçlar şunlardır:
- Selenium WebDriver: Web tarayıcıları üzerinde otomasyon testleri yapmak için kullanılır.
- JUnit: Java tabanlı testlerin yazılması ve yönetilmesi için kullanılan bir çerçevedir.
- ChromeDriver: Google Chrome tarayıcısını otomatikleştirmek için kullanılan bir Selenium WebDriver sürücüsüdür.

Bu metodlar, Selenium WebDriver kullanarak Amazon.com.tr üzerinde otomasyon testleri yaparken yaygın olarak kullanılan işlevleri gerçekleştirmek için kullanılabilir. Bu sınıf, test senaryolarının yazılmasını ve yönetilmesini kolaylaştırmak için kullanılabilir.
- WebDriver'ı başlatmak ve FluentWait ayarlarını yapılandırmak için gerekli işlemleri gerçekleştirir.
- Belirli bir HTML öğesini bulmak için findElement() ve findElements() metodlarını sağlar.
- Belirli bir HTML öğesine tıklamak için click() metodunu sağlar.
- Bir HTML öğesine metin girişi yapmak için sendKeys() metodunu sağlar.
- Bir HTML öğesinin metnini almak için getText() metodunu sağlar.
- Bir HTML öğesinin üzerine gelmek için hoverElement() metodunu sağlar.
- Bir HTML öğesinin belirli bir süre içinde görünür olup olmadığını kontrol etmek için isElementVisible() metodunu sağlar.
- Belirli bir süre veya milisaniye boyunca beklemek için waitBySeconds() ve waitByMilliSeconds() metodlarını sağlar.

----------------------------------------------------------------
ENG - Project Description
This project is designed to conduct automation tests on Amazon.com.tr using Selenium WebDriver. It is written in the Java programming language. These automation tests can be utilized to automatically test and verify specific functionalities of the Amazon.com.tr website. For instance, automation tests can perform actions such as clicking on certain buttons, inputting text, verifying specific text, and checking the visibility of certain elements within a specified duration. Such automation tests can be used to enhance quality control during the development process and ensure the stability of the website.
This Maven project, designed in IntelliJ IDEA, is aimed at conducting automation tests on Amazon.com.tr. The main components and versions of the project are as follows:
- JUnit Jupiter API (5.10.2): A test framework used for writing Java-based tests.
- JUnit (4.13.2): An older version of JUnit, included in the project, though migration to JUnit Jupiter API is possible for writing tests.
- Selenium Java (4.20.0): An automation tool used for testing web applications. The project utilizes Selenium's Java version to conduct tests on web browsers.
- Maven Compiler Plugin (3.13.0): Used to configure compilation settings for the Maven project. It configures Maven Compiler Plugin to compile and run Java code.
The project also utilizes UTF-8 character encoding for Java. It specifies Java 22 as the compilation and target JDK version. This Maven project provides the essential tools required for conducting automation tests on Amazon.com.tr, using specific versions of these tools.

The primary tools used in the project are as follows:
- Selenium WebDriver: Used for conducting automation tests on web browsers.
- JUnit: A framework used for writing and managing Java-based tests.
- ChromeDriver: A Selenium WebDriver driver used to automate Google Chrome browser.

These methods can be used to perform common functionalities typically used when conducting automation tests on Amazon.com.tr using Selenium WebDriver. This class can be utilized to facilitate the writing and management of test scenarios.
- It performs necessary operations to initialize the WebDriver and configure FluentWait settings.
- It provides methods like findElement() and findElements() to locate specific HTML elements.
- It offers the click() method to click on a specific HTML element.
- It provides the sendKeys() method to input text into a HTML element.
- It offers the getText() method to retrieve the text of a HTML element.
- It provides the hoverElement() method to hover over a HTML element.
- It offers the isElementVisible() method to check if a HTML element is visible within a specific duration.
- It provides the waitBySeconds() and waitByMilliSeconds() methods to wait for a specific duration in seconds or milliseconds, respectively.
