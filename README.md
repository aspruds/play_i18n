Play app with additional i18n support (pluralization)
=================================

## Rationale

It is easy to pluralize strings en English. The only difference between
"You have 1 message" and "You have 1 messages" is the additional "s" at the end. According to
[CLDR](http://www.unicode.org/cldr/charts/27/supplemental/language_plural_rules.html), this means that
English has two categories for plurals, namely, "one" and "other".
The rules are more complex for other languages. For example, Latvian language has a special
 case if the number is 0 (thus, zero, one, other), while Polish language have 4 categories (one, few, many, other).

## What it does

This repository contains a small tutorial on how to pluralize messages in Play Framework. Messages are stored in the following format:

English:
```
new.messages.one=You have one message
new.messages.other=You have {0} messages
```

Latvian:

```
new.messages.zero=Jums nav ziņojumu
new.messages.one=Jums ir viens ziņojums
new.messages.other=Jums ir {0} ziņojumi
```

To actually display pluralized messages, you will need to import "utils.i18n.MessageUtils._" in the template. Pluralize
method can then be called as following:

```
@messages.pluralize("new.messages", 0)
```

## Acknowledgements

The code was based on idea from StackOverflow: http://stackoverflow.com/questions/14326653/java-internationalization-i18n-with-proper-plurals




