@lombok.Value
class Test {
  String test;
  static {
    new Test("test").getTest();
  }
}
