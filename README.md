*** 1st part of the task in the peer39parser package

*** 2nd part of the task in the peer39categorizer package

*** checking endpoints
                1st part (parsing HTML)
 you need to send this json to this address - localhost:8080/api/v1/parseURLs
        {"inputURLs":[           
                    "https://www.bbc.com",
                    "https://edition.cnn.com/sport",
                    "https://www.glamour.de/frisuren/frisurenberatung/haarschnitte",
                    "http://edition.cnn.com/","https://www.tvblog.it/post/1681999/valerio-fabrizio-salvatori-gli-inseparabili-chi-sono-pechino-express-2020",
                    "https://www3.forbes.com/business/2020-upcoming-hottest-new-vehicles/13/?nowelcome",
                    "https://www.radiosport.co.nz/sport-news/rugby/accident-or-one-last-dig-eddie-jones-reveals-hansens-next-job/",
                    "http://www.msn.com/en-nz/travel/tripideas/70-of-the-planets-most-breathtaking-sights/ss-AAIUpDp"
        ]}
                2nd part (categorizing)
you need to send this json to this address - localhost:8080/api/v1/category
        {
        "inputURLs":[
        "http://www.starwars.com",
        "https://www.imdb.com/find?q=star+wars&ref_=nv_sr_sm",
        "https://edition.cnn.com/sport"
        ],
        "categories":["Star Wars","Basketball"]
        }