# field-modify-flaky
A flaky test example using a direct field modification

The victim test is `in.natelev.NumbersTest.testNumbers` <br>
The polluter test is `in.natelev.NumbersModifierTest.testAdd`

The problem is that the victim assumes that the public static field `Numbers.num` is equal to 0 when the test starts, but the polluter adds 10 to it via the `NumbersModifier.add` method (which directly modifies the field).

The solution is to add in a call to `numbersModifier.reset()` at the end of the body of the polluter.

