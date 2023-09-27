# buyTicket
ability to buy a ticket

# How to Run App (Ensure npm dependencies are installed for frontend AND backend)
cd backend <br />
npm start <br />
^c twice when done

## User Stories to Tackle (sprint 0)
- [ ] As a ticket buyer, I want to receive a confirmation email after a successful purchase.
- [ ] As a ticket buyer, I want to be able to purchase tickets across different seating categories in the same purchase.


## To Do (backend)
- [x] Initialise Spring Boot Project w mySQL DB access
- [x] Initialise a mySQL DB
- [x] ER Diagram for DB
- [x] Update application.properties to connect to mySQL DB
- [x] Update DB using update.sql (after purchase)
- [x] Use placeholder user (to connect to actual users afterwards)
- [x] Create a Ticket Entity, Repository, Service, Controller
- [ ] Create a TicketPurchase Entity, Repository, Service, Controller
- [ ] Pull user information from DB (use placeholder first)
- [X] Use email API to send confirmation email upon successful purchase
- [ ] Dockerize the application (afterwards)

## To Do (frontend)
- [x] Initialise a Svelte project with Bootstrap and other necessary dependencies
- [ ] Create a layout using HTML to represent the ticket purchasing page
- [ ] Display seating categories
- [ ] Create interactive components to allow users to select seats
- [ ] Implement a shopping cart where selected seats are displayed
- [ ] Implement a login/user authentication feature to link purchases with user accounts
- [ ] Integrate a payment gateway or simulate a payment process for testing
- [ ] Confirm purchase with user
- [ ] Integrate an email service (eg. SendGrid) to send confirmation emails
- [x] Customise the appearance of the UI elements (perhaps use swal)
- [ ] Test whole process of buying
- [ ] Implement error handling for scenarios like failed payments or network errors (provide error messages)
- [ ] Make sure app is accessible by following WCAG guidelines
- [ ] Deploy Svelte app to the production environment
# ticketslave (main repo)

## Description
- To be added

## Installation
1. Get hidden files
- .env
- terraform.tfstate

2. Granting Permission
- chmod +x push_to_ecr.sh
- chmod +x terraform_deploy.sh
- aws configure

3. Pushing to ECR
- sh push_to_ecr.sh
- sh terraform_deploy.sh
> will get prompted for s