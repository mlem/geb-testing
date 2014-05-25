package at.willhaben.marktplatz

import at.willhaben.pages.WillhabenLoginPage
import at.willhaben.pages.WillhabenStartPage
import at.willhaben.pages.marktplatz.WillhabenMarktplatzPage
import at.willhaben.pages.marktplatz.WillhabenPrivatGewerblichAuswahlPage
import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class AnzeigeAnlegenSpec extends GebReportingSpec {

    def setup() {
        baseUrl = "http://www.willhaben.at/iad/"
    }

    def "go to marktplatz"() {
        when:
        to WillhabenStartPage

        then:
        at WillhabenStartPage

        when:
        marktplatzLink.click()

        then:
        at WillhabenMarktplatzPage

    }

    def "start anzeigen aufgabe"() {
        when:
        to WillhabenMarktplatzPage

        then:
        at WillhabenMarktplatzPage

        when:
        anzeigeAufgebenLink.click()

        then:
        at WillhabenPrivatGewerblichAuswahlPage

        when:
        privatanzeigeKostenlosLink.click()

        then:
        at WillhabenLoginPage

    }

}