# Eid Project: Online Shop
## introduction
In this project, I created a simulation of an online shop using OOP principles. The program allows users to create and manage their accounts, browse products, and send request to admins to add money to their wallet. Sellers first request to be added and after that, they can add products. Admins manage seller and user requests and can add other admins to the shop.

## Design and Implementation
- First I created required classes for accounts, products and different categories including electronics, books, clothes, etc.
- In this program since all accounts have common attributes `username` and `password`, all of them inherit from account class.
- There's also the product class which is the superclass for all kinds of goods you can buy in this shop.
- Input validation is checked using Regex (password, email, phone)
- This program authenticates the login information and prevents the creation of two accounts with the same username.
- There's always an `Admin` with the name and password "admin" declared in shop.