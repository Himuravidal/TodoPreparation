package com.example.adacher.todopreparation.data;

import com.example.adacher.todopreparation.models.Pending;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adacher on 25-04-17.
 */

public class Queries {

    public List<Pending> pendings() {

        List<Pending> pendings = new ArrayList<>();
        List<Pending> pendingList = Pending.listAll(Pending.class);
        if (pendingList != null && pendingList.size() > 0) {
            pendings.addAll(pendingList);

        }
        return pendings;

    }
}
