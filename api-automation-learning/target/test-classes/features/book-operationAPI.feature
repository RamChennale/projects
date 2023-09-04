#Author: your.email@your.domain.com
#Keywords Summary :
@BookOPS
Feature: Book store API

  Background: User generates token for Authorisation
    Given I am an authorized user

  Scenario: Authorized user should be able to Add and Remove books.
    Given A list of boos are available
    When I add a book to my reading list
    Then The book is added
    When I remove a book from reading list
    Then The book is removed
