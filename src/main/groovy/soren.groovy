import groovy.transform.Canonical

@Canonical
class Person {
    String first
    String last
}

Person p1 = new Person(first: 'Søren', last: 'Glasius')
Person p2 = new Person(first: 'Søren', last: 'Glasius')
Person p3 = new Person('Søren', 'Glasius')

assert p1 == p2
assert p1 == p3

Set people = [p1, p2, p3]
assert people.size() == 1