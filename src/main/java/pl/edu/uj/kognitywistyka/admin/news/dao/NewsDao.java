package pl.edu.uj.kognitywistyka.admin.news.dao;

import java.util.List;

import pl.edu.uj.kognitywistyka.admin.news.model.News;

public interface NewsDao {
	void addNews(News news);

	List<News> findAllNews();
	
	News getNews(News news);
	void updateNews(News news);
}
