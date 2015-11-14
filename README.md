# proto-j
A JavaFX IDE for Ultrastructure

Because I'm not all that hot with JavaScript, I'm reduced to using JavaFX to create an IDE for 
prototyping, developing and exploring Ultrastructure workspaces and instances ;)

The IDE will connect to the Ultrastructure instance over the GraphQL API, so from an API POV, it will operate like
a JavaScript UI would.  This turns out to not be a bad pattern in a JavaFX application.  And JavaFX, unlike
JavaScript (for the most part), has an IDE of it's own so I can actually simply create the UI instead of fighting
with tool chains and the UIX model of the month club.

Something like this also provides a nice interactive model that forms a kind of specification for what 
I'm actually looking for in an IDE.  And it will progress the Ultrastructure GraphQL API suite just
as rapidly as if I was using a Unicorn JavaScript UI.