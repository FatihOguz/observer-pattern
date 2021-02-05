# observer-pattern
QUESTION:
after the last project, you were fed up with numerical analysis, and on the
spur of the moment, you quit your job. After a few weeks of lurking at your sofa and watching
depressive netflix series, you get a brilliant idea that no one has ever thought of before!
Everybody has their own list of favorite websites. But nobody wants to check them daily n times to
see if they have been updated with new content (content = either text, photographs or audio)!
Wouldn’t it be great if you could subscribe to your favorite website, and the websites somehow
notified the subscribers of new content? So much wow, such originality! Doge is impressed. You’re
certain that you’ll make millions from this and all major websites will support it!
However, as a seasoned professional (who has never heard of RSS) you must make sure that:
- it’s trivial to add and remove subscribers, as it’ll happen often
- a subscriber can be in the form of any software using your library. So your API must be easy to
use.- a subscriber might be interested in only new text updates, or photograph updates or audio updates
or a combination thereof. There is no need to disturb them if the update is not of the desired type.
What kind of a design would support this?
- What if users or websites demand your software to support a fourth type of content? Will it be
easy to modify? It better be.
You will:
- Provide the class diagrams with the appropriate arrows and contents (in detail, all the methods and
variables involved with the appropriate access rights), that satisfy the design requirements; strive for
maximum flexibility, loose coupling and minimum cost of maintenance!

REPORT:
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
