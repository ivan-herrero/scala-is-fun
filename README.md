### Scala is Fun

In a world ruled by Casio calculators, we want to build our own calculator to achieve freedom.

You will find the `Calculator` object under `/src/main/scala/com/intenthq/scalaisfun`, but it's missing
the implementation for most functions. Your job is to implement all the functions.

There's also a unit test suite named `CalculatorSpec` under `/src/test/scala/com/intenthq/scalaisfun`. Some
of the tests have been already written for you as an example, please, write all the missing tests and make sure
they are all green!

We suggest a couple ways to run the tests:

- Using `sbt`: start an `sbt` shell from within the root directory of this project, and then run `test`.

- Using [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/) (it's free): import the project and
once you have everything set up, right click on the `CalculatorSpec` file and run it with: `Run 'CalculatorSpec'`.


*NOTE*: Initially the tests will fail because one of them is using the `sum(xs: List[Int]): Int` function which
hasn't been implemented yet, once you code its implementation you should be able to run the tests.
