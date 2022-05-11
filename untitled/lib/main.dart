import 'package:flutter/material.dart';

@override
Widget build(BuildContext context) {
  return new Scaffold(
    appBar: new AppBar(
      title: new Text('zioo'),
    ),
    body:
    new Text(
        "zio",
        style: new TextStyle(fontSize:19.0,
            color: const Color(0xFF000000),
            fontWeight: FontWeight.w900,
            fontFamily: "Roboto")
    ),

  );
}