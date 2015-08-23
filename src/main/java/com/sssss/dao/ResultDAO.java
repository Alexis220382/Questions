package com.sssss.dao;

import com.sssss.entity.Result;

import java.util.List;

/**
 * Created by B50-30 on 22.08.2015.
 */
public interface ResultDAO {

    public void saveResult(Result result);
    public List<Result> getAllResults(Result result);
    public Result getResultById(String id);
    public void deleteResult(Result result);
}
