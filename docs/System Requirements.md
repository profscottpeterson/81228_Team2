
# Software Requirements Specification

for Pizza Planet

## Version 1.0 approved

Prepared by names...

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
* 09-26-2017 initial

## 1. Introduction
**Purpose**

><Identify the product whose software requirements are specified in this document, including the revision or release number. Describe the scope of the product that is covered by this SRS, particularly if this SRS describes only part of the system or a single subsystem.>

Ability for a Restaurant to create and track orders placed by employees, customers, or incognito guests.

### References

><List any other documents or Web addresses to which this SRS refers. These may include user interface style guides, contracts, standards, system requirements specifications, use case documents, or a vision and scope document. Provide enough information so that the reader could access a copy of each reference, including title, author, version number, date, and source or location.>

None

## 2. Overall Description

### User Classes and Characteristics
> <Identify the various user classes that you anticipate will use this product. User classes may be differentiated based on frequency of use, subset of product functions used, technical expertise, security or privilege levels, educational level, or experience. Describe the pertinent characteristics of each user class. Certain requirements may pertain only to certain user classes. Distinguish the most important user classes for this product from those who are less important to satisfy.>

There are 3 primary users of this system: admin, employee and customer.

Admin: has the ability to administer the system and keep secure and up to date.

Employee: 

1) manager – has all abilities to store, add menu items, look at orders and reports and all abilities under staff.

2) staff – create and place orders, accept and validate payment, create and update user information.
User: 1) customer - create and place orders, enter and save payment information, create and update user information, look at previous order history. 2) guest – is for someone who doesn’t want to save any info and just wants to order pizza.

### Operating Environment

><Describe the environment in which the software will operate, including the hardware platform, operating system and versions, and any other software components or applications with which it must peacefully coexist.>

Mac, Windows and Linux

>If it’s a (non-web) application, provide the environment: Windows Vista on a P4 100MHz and higher. Look at software specifications on the web, and see what they say.
Design and Implementation Constraints
<Describe any items or issues that will limit the options available to the developers. These might include: corporate or regulatory policies; hardware limitations (timing requirements, memory requirements); interfaces to other applications; specific technologies, tools, and databases to be used; parallel operations; language requirements; communications protocols; security considerations; design conventions or programming standards (for example, if the customer’s organization will be responsible for maintaining the delivered software).>

>You may have some or None. Think about it though, if you write “none”, but it is obvious you should have some, I will deduct points!

### Assumptions and Dependencies

><List any assumed factors (as opposed to known facts) that could affect the requirements stated in the SRS. These could include third-party or commercial components that you plan to use, issues around the development or operating environment, or constraints. The project could be affected if these assumptions are incorrect, are not shared, or change. Also identify any dependencies the project has on external factors, such as software components that you intend to reuse from another project, unless they are already documented elsewhere (for example, in the vision and scope document or the project plan).>

_Dependencies_ – Oracle keeping Java up to date and secure. Database administration and up time. Intranet and Internet capabilities and uptime. Credit card transactions and security.

_Assumptions_ – Already valid business model in place.

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

### Software Interfaces

><Describe the connections between this product and other specific software components (name and version), including databases, operating systems, tools, libraries, and integrated commercial components. Identify the data items or messages coming into the system and going out and describe the purpose of each. Describe the services needed and the nature of communications. Refer to documents that describe detailed application programming interface protocols. Identify data that will be shared across software components. If the data sharing mechanism must be implemented in a specific way (for example, use of a global data area in a multitasking operating system), specify this as an implementation constraint.>

>These are internal connections to things like databases, web servers. You mainly need to explain that you have them, but I don’t expect detailed information about how you actually connect to them and use them. Just explain that you do connect to them and use them for storage of customer information, or to process incoming web requests, etc… These are internal components of your system.

### Communications Interfaces

><Describe the requirements associated with any communications functions required by this product, including e-mail, web browser, network server communications protocols, electronic forms, and so on. Define any pertinent message formatting. Identify any communication standards that will be used, such as FTP or HTTP. Specify any communication security or encryption issues, data transfer rates, and synchronization mechanisms.>

>These are external communication mechanisms. Do you connect to a bank computer to verify credit card information? That is NOT part of your system, so it is an external communication you have. Describe it here. Do you have other systems connecting in to yours to perform some function? That would also go here.

## 4. System Use Cases

>The overall use case diagram should be here.

>The text description of each use case should follow.

Use case name and identifier
Unique Identifier
Objective - What is the ultimate objective of the use-case. What is it trying to achieve? What was the source of the use-case requirement? 
Priority – The overall priority of this use-case (Low, Medium, High)

Source – Who is the main source of this use case. Who cares most about this functionality? This should be the one person you would ask if there is a question about this use-case. (Make up a name and cite their: John Smith (End-user) here.)

Actors - Who is involved in the use-case? Which actors/stakeholders?

Flow of Events   

Basic Flow - flow of events normally executed in the use-case 
Alternative Flow(s) - a secondary flow of events due to infrequent conditions

Exception Flow(s) - Exceptions that may happen during the execution of the  use case

Includes - other use case IDs that are referenced in steps in the flow of events.

Preconditions - Any condition that must be satisfied before the use case begins. If the condition is “User is logged in”, then the first step of the use case is NOT “User logs in”. They are already logged in if that is a pre-condition!

Post conditions - The conditions that will be satisfied after the use case successfully completes

Notes/Issues - Any relevant notes or issues that need to be resolved

>Withdraw money from ATM (U2)
U2
Objective – The customer is withdrawing money from the ATM and the system will debit the customer’s account.
Priority – High
Source – Carl Gnome (marketing)	
Actors – Customer, central bank computer
Flow of Events   
Basic Flow 
Customer chooses the checking option on the ATM
Customer chooses the amount of money needed
Customer confirms the choice
System validates the amount
System asks central bank computer to debit the customer’s account
System issues money to the user
Alternative Flow 1 – At step 5.1.4 the amount is not a multiple of $20
An error message is displayed telling the customer they must use multiple of $20.
Return to step 5.1.2
Alternative Flow 2 – At any step the user presses “cancel”
System returns to the main menu
Alternative Flow 3 - At step 5.1.5 bank computer returns a  failed status, “insufficient funds”
An error message is shown to the user
Return to step 5.1.2	
Exception Flow 1 – 
Database is locked due to backup in progress. System executes use case U5
Includes 
U5 – Exception occurs
Preconditions – User is logged in
Post conditions – Money has been returned to the user and their account balance has been updated.
Notes/Issues – None

Use Cases Ideas:
Placing an order, actor: customer/employee, obj: have the ability for a customer/employee to place an order in the system. Priority: Must have operational to go live, source: all users, flows of events: customer calls/walk ins, places order at kiosk or w/employee, customer selects what food they want to order, add to shopping cart, checkout, confirm checkout.

>Deposit money into ATM  (U3)

## 5. Other Nonfunctional Requirements

### Performance Requirements

><If there are performance requirements for the product under various circumstances, state them here and explain their rationale, to help the developers understand the intent and make suitable design choices. Specify the timing relationships for real time systems. Make such requirements as specific as possible. You may need to state performance requirements for individual functional requirements or features.>

Place orders, shopping cart (checkout and payment, CRUDE order), crud menu, crud category, login (admin, customer, employee), CRUD Users, crud ingredients

### Safety Requirements

><Specify those requirements that are concerned with possible loss, damage, or harm that could result from the use of the product. Define any safeguards or actions that must be taken, as well as actions that must be prevented. Refer to any external policies or regulations that state safety issues that affect the product’s design or use. Define any safety certifications that must be satisfied.>

>In this section, just say “See section 7 requirements 25-32”. And I’ll assume those requirements are Safety related.

### Security Requirements
<Specify any requirements regarding security or privacy issues surrounding use of the product or protection of the data used or created by the product. Define any user identity authentication requirements. Refer to any external policies or regulations containing security issues that affect the product. Define any security or privacy certifications that must be satisfied.>

>In this section, just say “See section 7 requirements 35-42”. And I’ll assume those requirements are Security related.

### Software Quality Attributes
><Specify any additional quality characteristics for the product that will be important to either the customers or the developers. Some to consider are: adaptability, availability, correctness, flexibility, interoperability, maintainability, portability, reliability, reusability, robustness, testability, and usability. Write these to be specific, quantitative, and verifiable when possible. At the least, clarify the relative preferences for various attributes, such as ease of use over ease of learning.>

>In this section, just say “See section 7 requirements 55-62”. And I’ll assume those requirements are Software Quality related.

## 6. Other Requirements
><Define any other requirements not covered elsewhere in the SRS. This might include database requirements, internationalization requirements, legal requirements, reuse objectives for the project, and so on. Add any new sections that are pertinent to the project.>

>You may not have any.

## 7. System Requirements Chart
>< Include a table in this section with the following columns:

>ID – Unique requirement ID
Priority – Priority of this requirement
Type – Functional(F) or Non-functional(NF)
Source – Who is most interested in this requirement (John Smith – Customer). For this project you can make it up, in reality you’ll want to capture this as you capture the requirements.
Contained in Use Case(s) – Which use cases reference this requirement or which use cases when executed will perform this requirement. There may be a few functional requirements without a use-case and the non-functional requirements generally will NOT be part of a use-case (so put N/A).
Description – The description of the requirement. “The system shall …. “
>

>These requirements should match up with your use case diagrams.

## Appendix A: Analysis Models

><Optionally, include any pertinent analysis models, such as data flow diagrams, class diagrams, state-transition diagrams, or entity-relationship diagrams.>

>Don’t do any of these for CS421 SRS. You will create these models during the high level design deliverable.

## Appendix B: To Be Determined List

><Collect a numbered list of the TBD (to be determined) references that remain in the SRS so they can be tracked to closure.>

>List here any open questions or things you know still need to be done to the SRS, but haven’t been addressed yet. (It’s okay to have things like that, especially in this project because we don’t have time to do everything.)