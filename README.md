# Anagrams

## Description

Here's a Maven project that reverses each word in Latin alphabet of input String, while leaving all non-letter symbols in their original position.

_Use only the Latin alphabet to test._

## Examples:

- Each word in the text should be reversed:

> "abcd efgh" => "dcba hgfe"

- All non-letter symbols should stay on the same places:

> "a1bcd efg!h" => "d1cba hgf!e"

## Usage

- In the root folder of this project enter command to build project:

> mvn clean package

- To execute in the root folder of this project enter command:

> java -jar target/Anagrams.jar
