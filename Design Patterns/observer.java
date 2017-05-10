// used when there is one-to-many relationship between objects
// such as if one object is modified, its depenedent objects are to be notified automatically -- behavioral
//Observer pattern uses three actor classes. Subject, Observer and Client. Subject is an object having methods to attach and
// detach observers to a client object.
// We have created an abstract class Observer and a concrete class Subject that is extending class Observer.
steps
1. Create Subject class.
2. Create Observer Class
3. Create concrete observer classes extending Observer Class
4. Use Subject and concrete observer objects.