import org.jsoup.Jsoup
import org.jsoup.nodes.Document

Document doc = Jsoup.connect('http://gr8conf.in').get()
assert doc.select(".container p")*.text() ==
        ['GR8Conf - Dedicated to the Groovy Ecosystem',
         'Organizer: TO THE NEW']

println doc