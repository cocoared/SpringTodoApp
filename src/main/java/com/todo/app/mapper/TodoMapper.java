package com.todo.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo.app.entity.Todo;

/*DBを操作するメソッドを呼び出すためのインターフェース。
*このインターフェースから、メソッドを呼び出します。
*このインターフェースの具象クラスは、MyBatisがXMLのSQL情報から自動で作成してくれます。
*/

@Mapper
public interface TodoMapper {
	
public List<Todo> selectAll();
public void add(Todo todo);
}
