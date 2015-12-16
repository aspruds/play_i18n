package utils.i18n

import com.ibm.icu.text.PluralRules
import com.ibm.icu.util.ULocale
import play.api.i18n.Messages

object MessageUtils {
  implicit class MessageOps(messages: Messages) {
    def pluralize(key: String, number: Double): String = {
      val locale = ULocale.forLanguageTag(messages.lang.language)
      val pluralRules = PluralRules.forLocale(locale);
      val rule = pluralRules.select(number)

      val pluralizedKey = s"$key.$rule"
      messages(pluralizedKey, number)
    }
  }
}
