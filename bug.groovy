```groovy
def myMethod(String str) {
    if (str == null) {
        return "Null String"
    } else if (str.length() == 0) {
        return "Empty String"
    } else {
        return "Non-empty String"
    }
}

println myMethod(null)
println myMethod("")
println myMethod("Hello")
```