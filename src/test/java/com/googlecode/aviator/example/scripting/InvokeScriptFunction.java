package com.googlecode.aviator.example.scripting;

import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngineManager;

public class InvokeScriptFunction {
  public static void main(final String[] args) throws Exception {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("AviatorScript");
    ScriptEngine engine = manager.getEngineByName("AviatorScript");
    // AviatorScript code in a String
    String script = "fn hello(name) { print('Hello, ' + name); }";
    // evaluate script
    engine.eval(script);

    // javax.script.Invocable is an optional interface.
    // javax.script.Invocable is an optional interface.
    // Check whether your script engine implements or not!
    // Note that the JavaScript engine implements Invocable interface.

    // invoke the global function named "hello"
    inv.invokeFunction("hello", "Scripting!!");
  }
}
