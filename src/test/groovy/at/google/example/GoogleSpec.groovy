package at.google.example

import at.google.pages.GoogleHomePage
import at.google.pages.GoogleResultsPage
import geb.spock.GebReportingSpec
import org.wikipedia.pages.WikipediaPage

class GoogleSpec extends GebReportingSpec {

    def "the first link should be wikipedia"() {
        when:
        to GoogleHomePage

        and:
        q = "wikipedia"

        then:
        at GoogleResultsPage

        and:
        firstResultLink.text() == "Wikipedia"

        when:
        firstResultLink.click()

        then:
        waitFor { at WikipediaPage }
    }

}