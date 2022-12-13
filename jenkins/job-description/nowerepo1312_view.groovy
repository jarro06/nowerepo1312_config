 
listView('nowerepo1312 Jobs') {
    description('nowerepo1312 Jobs')
    jobs {
        regex('nowerepo1312_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
