# Software Requirements Specification

for Pizza Planet

## Version 1.0

Prepared by:
Henry Ilgen, Quinn Capelle, Zach Eckert, Andrew Moule, Perry Sieber

Team Pizza Planet

09-26-2017

**Table of Contents**
* Revision History	
1. Introduction
* Purpose 	
* References
2. Overall Description
* User Classes and Characteristics
* Operating Environment
* Design and Implementation Constraints
* Assumptions and Dependencies
3. External Interface Requirements
* User Interfaces
* Hardware Interfaces
* Software Interfaces
* Communications Interfaces
4. System Use Cases
* Use case name and identifier
* Withdraw money from ATM (U2)
* Deposit money into ATM
5. Other Nonfunctional Requirements
* Performance Requirements
* Safety Requirements
* Security Requirements
* Software Quality Attributes
6. Other Requirements
7. System Requirements Chart
* Appendix A: Analysis Models
* Appendix B: To Be Determined List

_Revision History_
* 09-26-2017 started work...

## 1. Introduction
**Purpose**

><Identify the product whose software requirements are specified in this document, including the revision or release number. Describe the scope of the product that is covered by this SRS, particularly if this SRS describes only part of the system or a single subsystem.>

This software provide the ability for a Restaurant to create and track food orders by Users. A User is an employee(administrator or staff) or a customer(registered or guest). A customer can place and pay for an order of items like pizzas, subs, wings and more. A registered customer can have their information (address and payment details) stored in our database in order to make the ordering process easier for customers. An employee can take and clear orders placed by customers, and the admin can add new menu items and update pries. 

### References

><List any other documents or Web addresses to which this SRS refers. These may include user interface style guides, contracts, standards, system requirements specifications, use case documents, or a vision and scope document. Provide enough information so that the reader could access a copy of each reference, including title, author, version number, date, and source or location.>



## 2. Overall Description

### User Classes and Characteristics
> <Identify the various user classes that you anticipate will use this product. User classes may be differentiated based on frequency of use, subset of product functions used, technical expertise, security or privilege levels, educational level, or experience. Describe the pertinent characteristics of each user class. Certain requirements may pertain only to certain user classes. Distinguish the most important user classes for this product from those who are less important to satisfy.>

There are two primary users of this system: Employee and Customer. There are two subcatagories of each primary type.

Employee - Admin: Has the ability to add or remove menu items, look at orders and reports. Also can create and place orders, accept and validate payment, create and update user information. Administers the system.

Employee - Staff: Can create and place orders, accept and validate payment, create and update user information.

Customer - Guest: Create and place orders, and pay for the order with cash or credit card that is not stored. 

Customer - Registered - Can also create and place orders, as well as store their payment and address information. Customers can then use this stored information to make the ordering process an easier and more streamlined experience.

### Operating Environment

><Describe the environment in which the software will operate, including the hardware platform, operating system and versions, and any other software components or applications with which it must peacefully coexist.>

Mac, Windows and Linux. Ideally this will be used on a tablet or other device with touch input.

>If it’s a (non-web) application, provide the environment: Windows Vista on a P4 100MHz and higher. Look at software specifications on the web, and see what they say.
Design and Implementation Constraints
<Describe any items or issues that will limit the options available to the developers. These might include: corporate or regulatory policies; hardware limitations (timing requirements, memory requirements); interfaces to other applications; specific technologies, tools, and databases to be used; parallel operations; language requirements; communications protocols; security considerations; design conventions or programming standards (for example, if the customer’s organization will be responsible for maintaining the delivered software).>

Micrsoft SQL server will be used for all database needs on the application.

Since we may be storing credit card info and other personal data, we will be employing encryption on the database and secure transmition technologies where applicable.

Hardware requirements:
1 gigahertz (GHz) or faster 32-bit (x86) or 64-bit (x64) processor*

1 gigabyte (GB) RAM (32-bit) or 2 GB RAM (64-bit)

16 GB available hard disk space (32-bit) or 20 GB (64-bit)

DirectX 9 graphics device with WDDM 1.0 or higher driver

### Assumptions and Dependencies

><List any assumed factors (as opposed to known facts) that could affect the requirements stated in the SRS. These could include third-party or commercial components that you plan to use, issues around the development or operating environment, or constraints. The project could be affected if these assumptions are incorrect, are not shared, or change. Also identify any dependencies the project has on external factors, such as software components that you intend to reuse from another project, unless they are already documented elsewhere (for example, in the vision and scope document or the project plan).>

_Dependencies:_ 
* Oracle keeping Java up to date and secure. Database administration and up time. Intranet and Internet capabilities and uptime. Credit card transactions and security.
* 3rd party cloud-based hosting of the database. They will be responsible for maintaining the database server and software.
* 3rd party payment processor

_Assumptions_ 
* Already valid business model in place.

## 3. External Interface Requirements
### User Interfaces
><Describe the logical characteristics of each interface between the software product and the users. This may include sample screen images, any GUI standards or product family style guides that are to be followed, screen layout constraints, standard buttons and functions (e.g., help) that will appear on every screen, keyboard shortcuts, error message display standards, and so on. Define the software components for which a user interface is needed. Details of the user interface design should be documented in a separate user interface specification.>

>Think about this in terms of standards, not specific features. For example, all buttons will have a black border
all fonts will be Arial Draw a screen template showing “main area”, “menu here”, “status bar” and describe each component. If you have multiple screen layouts depending on the user’s current task/settings, describe them
What screen resolutions will you support?
Will you be Section 508 compliant? Are there any other standards you support?
etc…

### Hardware Interfaces

><Describe the logical and physical characteristics of each interface between the software product and the hardware components of the system. This may include the supported device types, the nature of the data and control interactions between the software and the hardware, and communication protocols to be used.>

>If you system doesn’t include hardware, then you’ll have none. If it has hardware components, then you should describe (at a high level) how you interface with that hardware.

Hardware for the minimum viable product is a standard computer, moniter, and keyboard and mouse to provide the input for placing the order.

### Software Interfaces

><Describe the connections between this product and other specific software components (name and version), including databases, operating systems, tools, libraries, and integrated commercial components. Identify the data items or messages coming into the system and going out and describe the purpose of each. Describe the services needed and the nature of communications. Refer to documents that describe detailed application programming interface protocols. Identify data that will be shared across software components. If the data sharing mechanism must be implemented in a specific way (for example, use of a global data area in a multitasking operating system), specify this as an implementation constraint.>

>These are internal connections to things like databases, web servers. You mainly need to explain that you have them, but I don’t expect detailed information about how you actually connect to them and use them. Just explain that you do connect to them and use them for storage of customer information, or to process incoming web requests, etc… These are internal components of your system.

The software interfaces with a cloud-based database, which will be managed by Microsoft SQL Server.

### Communications Interfaces

><Describe the requirements associated with any communications functions required by this product, including e-mail, web browser, network server communications protocols, electronic forms, and so on. Define any pertinent message formatting. Identify any communication standards that will be used, such as FTP or HTTP. Specify any communication security or encryption issues, data transfer rates, and synchronization mechanisms.>

>These are external communication mechanisms. Do you connect to a bank computer to verify credit card information? That is NOT part of your system, so it is an external communication you have. Describe it here. Do you have other systems connecting in to yours to perform some function? That would also go here.

* The software interfaces with a cloud-based database.
* 3rd party payment processor


## 4. System Use Cases

>The overall use case diagram should be here.

>The text description of each use case should follow.

* enable User(Customer) to log into their account 1
* enable User(Customer) to create a new account 2
* enable User(Customer) to edit existing account info 3
* enable User(Customer) to select category of food type (pizza) 4
* enable User(Customer) to view menu item  details 5
* enable User(Customer) to update menu items detail (choose toppings) 6
* enable User(Customer) to add menu item to order 7 
* enable User(Customer) to remove items from order 8
* enable User(Customer) to update quantity of items in order 9
* enable User(Customer) to delete the current order 10
* enable User(Customer) to checkout Order 11
* enable User(Customer) to pay for the order with a credit card 12
* enable User(Customer) to pay for the order with cash 13
* enable User(Customer) to receive a confirmation after completing the transaction 14
* enable Employee(Staff) to read order 15
* enable Employee(Staff) to update order 16
* enable Employee(Staff) to delete order 17
* enable Employee(Admin) to create menu 18
* enable Employee(Admin) to update menu 19
* enable Employee(Admin) to delete menu 20
* enable Employee(Admin) to create menu items 21
* enable Employee(Admin) to update menu items 22
* enable Employee(Admin) to delete menu items 23
* enable Employee(Admin) to create Customer 24
* enable Employee(Admin) to update Customer 25
* enable Employee(Admin) to delete Customer 26
* enable Employee(Admin) to create report 27
* enable Employee(Admin) to update report 28
* enable Employee(Admin) to delete report 29

See appendix I Use Cases.


## 5. Other Nonfunctional Requirements

### Performance Requirements

><If there are performance requirements for the product under various circumstances, state them here and explain their rationale, to help the developers understand the intent and make suitable design choices. Specify the timing relationships for real time systems. Make such requirements as specific as possible. You may need to state performance requirements for individual functional requirements or features.>

Place orders, shopping cart (checkout and payment, CRUD order), CRUD menu, CRUD category, login (admin, customer, employee), CRUD Users, CRUD ingredients

### Safety Requirements

><Specify those requirements that are concerned with possible loss, damage, or harm that could result from the use of the product. Define any safeguards or actions that must be taken, as well as actions that must be prevented. Refer to any external policies or regulations that state safety issues that affect the product’s design or use. Define any safety certifications that must be satisfied.>

>In this section, just say “See section 7 requirements 25-32”. And I’ll assume those requirements are Safety related.

There are no safety concerns related to the software.

### Security Requirements
<Specify any requirements regarding security or privacy issues surrounding use of the product or protection of the data used or created by the product. Define any user identity authentication requirements. Refer to any external policies or regulations containing security issues that affect the product. Define any security or privacy certifications that must be satisfied.>

>In this section, just say “See section 7 requirements 35-42”. And I’ll assume those requirements are Security related.

Since we may be storing credit card info and other personal data, we will be employing encryption on the database and secure transmition technologies where applicable.

### Software Quality Attributes
><Specify any additional quality characteristics for the product that will be important to either the customers or the developers. Some to consider are: adaptability, availability, correctness, flexibility, interoperability, maintainability, portability, reliability, reusability, robustness, testability, and usability. Write these to be specific, quantitative, and verifiable when possible. At the least, clarify the relative preferences for various attributes, such as ease of use over ease of learning.>

>In this section, just say “See section 7 requirements 55-62”. And I’ll assume those requirements are Software Quality related.

Hardware will have to hold up to heavy use and greasy fingers. 

The software interface will need to be easy to use and understand, since it will be used by customers. This will ensure the customer experience is as easy and streamlined as possible.

## 6. Other Requirements
><Define any other requirements not covered elsewhere in the SRS. This might include database requirements, internationalization requirements, legal requirements, reuse objectives for the project, and so on. Add any new sections that are pertinent to the project.>

>You may not have any.

There are no Other Requirements.

## 7. System Requirements Chart
>< Include a table in this section with the following columns:
>These requirements should match up with your use case diagrams.

>* ID – Unique requirement ID
>* Priority – Priority of this requirement
>* Type – Functional(F) or Non-functional(NF)
>* Source – Who is most interested in this requirement (John Smith – Customer). For this project you can >make it up, in reality you’ll want to capture this as you capture the requirements.
>* Contained in Use Case(s) – Which use cases reference this requirement or which use cases when executed will perform this requirement. There may be a few functional requirements without a use-case and the non-functional requirements generally will NOT be part of a use-case (so put N/A).
>* Description – The description of the requirement. “The system shall …. “


## Appendix A: Analysis Models

><Optionally, include any pertinent analysis models, such as data flow diagrams, class diagrams, state-transition diagrams, or entity-relationship diagrams.>

>Don’t do any of these for CS421 SRS. You will create these models during the high level design deliverable.

## Appendix B: To Be Determined List

><Collect a numbered list of the TBD (to be determined) references that remain in the SRS so they can be tracked to closure.>

>List here any open questions or things you know still need to be done to the SRS, but haven’t been addressed yet. (It’s okay to have things like that, especially in this project because we don’t have time to do everything.)
