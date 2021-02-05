# observer-pattern



I use observer design pattern.
superSubject abstract class implements that every subject classes use
same action.
notifyObserver(Object o) is abstract method.
because, this method use unique declared fields of subject classes.
so implements differently for every subject classes
this method answer specifically to observers class.
if changed knowledge of field of observer ,notifies them.
it decides this by comparing the declared fields of the object with the
observer using the reflection class.
