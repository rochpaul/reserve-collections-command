package unidue.rcc.migration.department.ropclient;

import unidue.rcc.migration.department.auto._ReserveCollectionsDatamap;

public class ReserveCollectionsDatamap extends _ReserveCollectionsDatamap {

    private static ReserveCollectionsDatamap instance;

    private ReserveCollectionsDatamap() {}

    public static ReserveCollectionsDatamap getInstance() {
        if(instance == null) {
            instance = new ReserveCollectionsDatamap();
        }

        return instance;
    }
}
