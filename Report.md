# Report

-----

## Group info

MSWE 261P Project: **Checkstyle**

Team name: 123master

Team member: Jiahan Tu, Shuaihua Niu, Jing Gu

Github: https://github.com/JingGu101/checkstyle

-------

## Questions:

### (1). What is the tool that you are testing? What is its purpose? Any other aspects that are relevant: size in terms of LOC, languages that it is written in, etc.

- The tool we are testing is checkstyle, a development tool to help programmers write Java code that adheres to a coding standard. It automates the process of checking Java code to spare humans from the checking task. This makes it ideal for projects that want to enforce a coding standard. Besides, checkstyle is highly configurable and can be made to support almost any coding standard. Checkstyle is highly configurable and can be made to support almost any coding standard.
- The example configuration files are supporting the Sun Code Conventions and Google Java Style. Checkstyle has 645693 lines of code, 28 packages, 100+ classes and is written in Java (98.6%), HTML(0.6%), Shell (0.5%), ANTLR (0.2%) and JavaScript (0.1%). It can check many aspects of our source code, including class design problems, method design problems. Besides, it also has the ability to check code layout and formatting issues.

### (2). Document its build. What did you need to do to get it built and running?

1. import project

    - If no project is currently open in IntelliJ IDEA, click Import Project on the Welcome screen. Otherwise, select File > New > Project from Existing Sources![img](https://lh4.googleusercontent.com/zTkDkNPY8xyTye0-EwJaRrecmxDWIt9vmEA768GVyiFzha06kO0xChyHJndWNw8I8rnEEFiSTZfVK4-SR1bDE-uEHAbIhPNtaKEXPABbDG7t4KM9Yj0jHg7MJBdj1_HDNskdg2n7)
    - Generate sources that a required by checkstyle by right click over pom.xml file and click on menu "Maven / Generate Sources and Update Folders"![img](https://lh5.googleusercontent.com/F7UCxrcVDiQtRiqd821igfmSKOyq9HpU-NmQunA3CQpM7cxl78Iun3NYCWXzFcvKeRNEVkGQwhE-QB0EauFUsexUsQuho7Lilaa7GBRhbDt9TADl-OMgWGCegIrKTfw6WXNrzXrc)


2. Debug

    - Open the Check's source file by double click on it in a source tree as is shown:![img](https://lh4.googleusercontent.com/jfqWOdAJ4EnDR53FKehjwukhOUARxiddaizpsGi2ippwR5B6EUrjDhdzskHD3QD2DWNcxknZViQN9IdTiVK-MB4l4HjlxKpHejK45psHeeNoB5LSEV2cGNWhlji3hw8VySQ0IAa7)


- Debug the Check by putting the breakpoint at controversial place (double-click) on the left part of line number as it is shown:![img](https://lh3.googleusercontent.com/ktyvXfOA-O2G9ir3i8Qq_x4izANXfmuv7a_sxxJMsyMaHHUpBa4u8dosNuAQKn2y91BdoIYotnUUSv3CZh8UtnO331GpZ62J-cyRpXzreoDSgybhbzFQchJnylVNMvB6dceIsWjF)

- Then right-click the corresponding Unit-test file or class definition > Debug "testName"![img](https://lh5.googleusercontent.com/VTS1KUVnkagGwVq9TiURRpPfFDGW_RbHqTAe0sR2l0tvduAGEGsY7soD1uz0xOp4aXZPS_t3ZsKjPQF8TiZq5QdTVMytkiUhaeSkxm6cxeSSI-zs90XY0RyirNp7VhQAnlc5kJbN)

3. organize imports

    - One of the Checkstyle checks we run on our own code requires a certain order of import statements. Few changes in IDE settings are required to help your IDE do it automatically.To change formatter settings please go to File->Settings in menu.Then in the tree go to: Editor->Code Style->Java, open Import tab (follow numbers on a picture) and apply settings highlighted:![img](https://lh3.googleusercontent.com/f950v-_V9LI7PdRtOpeAbFnWp90qZiTAPkWTa-CkKZf5uhsTtJBWSGGQO2CQ3TxBsxnOtA7jIZI1M0fP0m45mY-JXFyC3mUuSE87fsmu6KDFgR_IuLCyuyDX79W5GGBROk7YxwsN)

4. inspections

    - Checkstyle has its own very strict set of inspections. To import and enable them go to Settings -> Editor -> Inspections -> Manage -> Import... and locate file config/intellij-idea-inspections.xml.![img](https://lh4.googleusercontent.com/GOtCc8DsptupaEHZFdH6l6reFM_2sDe1mf3dHd3a7GPlMvjsEJuLerjf5VRdvD-1b4Xr6UZLGOCeevfNUlDgQ1KowTx-dMtR0bvyQs9N6Ullui_Bt13U0d335kxaTyzSwPZJdzlO)
    - ATTENTION: Not all files in repository should be analyzed. For example test input files contain numerous violations on purpose. Our shared inspection scope should be used to exclude such files. Add custom scope copy file config/intellij-idea-inspection-scope.xml to .idea/scopes directory. Command from root of repo is:mkdir -p .idea/scopes; cp config/intellij-idea-inspection-scope.xml .idea/scopes/Now it should be ready to be used in Inspect Code window (Analyse -> Inspect Code):![img](https://lh3.googleusercontent.com/uv7YPtHWEfz0rOoGzY6sfw9Urlgrycwfu-NcuIlbVuYWan4VzGFLWG-qKk0-opq4J363c4TuCNzQaJPcISJd79jKkHUWv43vdAF_hrzRDJNo4y3C41Od26v9gLUG6f8QiWBKpeUp)

5. disable auto indent on paste

    - IDEA has it's own rules of indentation when pasting code and it applies these rules to all the lines of the copied code. This may result in wrong formatting of code in many checkstyle files. A simple solution to this problem is by using the key combinations Ctrl + Shift + Alt + V or Edit | Paste Simple. However it is recommended that this settings be changed by default as shown below![img](https://lh4.googleusercontent.com/iiNNt3CWxffyZZ5oiZOXiUyxiw4ZoyTcPKU12zv0PdMLRcu4UQrs-A2rVzN2dw-Ucg9z8wNpA7PLOaMzCccte49nYM6VOJmLzJa_l5gtRSUHlKVG6Kko2WJ0dkPz7jTj0Z3JT1Oj)

6. run
   //reference from web: https://maven.apache.org/plugins/maven-checkstyle-plugin/examples/custom-developed-checkstyle.html

    - First we set up the directory structure for the custom project, it looks like the structure in the following pictures, we need two xml files: pom.xml and packagenames.xml	![img](https://lh6.googleusercontent.com/jE76Z7zsaw6uU7w60daCRz_35h6pLLHSOdfWQ7hicaYv5Sa9xLzf2o5pC3zniEqhCxb2yhHlPtBRjS4JUHPZRFDEYF4ouQbMNJYK8i2rwxesDGbCZ-V-wOsFMdJgJ02VK--7JVGd)

    - mycompany-checkstyle-checks

    - ```tex
     mycompany-checkstyle-checks
     |-- pom.xml
     `-- src
        `-- main
            `-- java
                `-- com
                    `-- mycompany
                        `-- checks
                            |-- packagenames.xml
     ```

    - ![img](https://lh4.googleusercontent.com/sA4JKypfUFyddAtEnWYNGydZSLrwAwwocaTmGwFWPM9D4MjUYvmaEEhbF40ZL_BUeSmjKG5KrzJVfArC2DbRQ-IzgLEQWgBrlTobEqauUfchpoYLwKgBvgIb3Lu4SpjK8gQVz4Uq)

    - ```xml
     <project>
       <modelVersion>4.0.0</modelVersion>
       <groupId>com.mycompany</groupId> 
       <artifactId>mycompany-checkstyle-checks</artifactId>
       <name>MyCompany Checkstyle Checks</name> 
       <version>1.0</version> 
       <dependencies>
         <dependency>
           <groupId>checkstyle</groupId
           <artifactId>checkstyle</artifactId>  
           	<version>3.1.2</version>
         </dependency>
       </dependencies>
     </project> 
     ```

    - packagenames.xml:

      ​	This file lets you specify the names of the packages that you want to be able to use. Here we have added com.mycompany.checks to the standard set of Checkstyle packages. That means that you can use your custom checks in the Checkstyle configuration file, without having to specify their package name. ![img](https://lh3.googleusercontent.com/qamNKdzhDv1QcXYik9HihhjGQcrHB-P2gQniDFmyrRAZsUKMt_zSokloK0VEemBVycN1zoQxaYANsUnZg1BOlUKXMcKb_BjDCc56qfLZE52DiUx3FP0YRSMtpPsQ_g8hD28W8AOH)

      ```xml
      <?xml version="1.0" encoding="UTF-8"?>
       
      <!DOCTYPE checkstyle-packages PUBLIC
       "-//Checkstyle//DTD Package Names Configuration 1.0//EN"
       "https://checkstyle.org/dtds/packages_1_0.dtd">
       
      <checkstyle-packages>
       <package name="com.mycompany.checks"/>
       <package name="com.puppycrawl.tools.checkstyle">
         <package name="checks">
           <package name="blocks"/>
           <package name="coding"/>
           <package name="design"/>
           <package name="duplicates"/>
           <package name="header"/>
           <package name="imports"/>
           <package name="indentation"/>
           <package name="j2ee"/>
           <package name="javadoc"/>
           <package name="metrics"/>
           <package name="modifier"/>
           <package name="naming"/>
           <package name="sizes"/>
           <package name="whitespace"/>
         </package>
         <package name="filters"/>
       </package>
      </checkstyle-packages>
      
      ```

### (3). Document the **existing test cases** (JUnit or otherwise). This should be a study of the existing testing practices and frameworks that are used already in the system. (This section might evolve as we learn more throughout the quarter.) How do you run them?

- The test cases are in the src/test/java folder. This project uses the JUNIT framework to test all test files. Each subfolder relates to one package in src. It can be run when clicking the Run/Debug button on IDEA.

![img](https://lh3.googleusercontent.com/FUaUxyPMexqdfuu4UytHdYbCVhi1C7iOMv1Cpba1UC7C--iR83dTuhk81TmgR4934CzDoiR6F0Rx0Tn5jeuerTHWlkdCzxaswBntlNAtTrh5KHz6WtaDioOPau2hhL8SoZQlCg4K)

### (4). Partitioning: First, motivate the need for systemic functional testing and partition testing. Describe these concepts. Then, select a feature that allows for partitioning. Specify your partitions (and boundaries when appropriate) in English — describe them. Then, write **new test cases** in JUnit, and describe and document those test cases and how they run.

- Functional testing is also known as black. box testing. Black box testing is a test to see if each function works correctly. In the test, the program is regarded as a black box that cannot be opened, and the program interface is tested without considering the internal structure and internal characteristics of the program. It only checks whether the program function is used normally according to the requirements specification. Thus, it is also called functional testing. Whether the program can properly receive input data and produce correct output information. Black box testing focuses on the external structure of the program without considering the internal logical structure, and mainly tests the software interface and software function.

- Partition is one of the crucial rules for testing. In testing we break things into different parts, like unit, integration, system, and test the correctness of each part. Usually when the system is too large, testing the system will be very problematic and taxing. But if we partition the large system into parts, it will be very easy to discover the bugs and find out which part to debug.



## Reference

------

https://maven.apache.org/plugins/maven-checkstyle-plugin/examples/custom-developed-checkstyle.html

https://checkstyle.sourceforge.io/index.html