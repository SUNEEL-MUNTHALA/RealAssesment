package Library.books.service;

import Library.books.data.BookData;
import Library.books.repository.BookRepo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class BookService implements BookRepo {
    @Override
    public String saveData(BookData bookData) {
        return null;
    }
























    @Override
    public void flush() {

    }

    @Override
    public <S extends BookData> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends BookData> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<BookData> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public BookData getOne(Long aLong) {
        return null;
    }

    @Override
    public BookData getById(Long aLong) {
        return null;
    }

    @Override
    public BookData getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends BookData> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends BookData> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends BookData> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends BookData> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends BookData> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends BookData> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends BookData, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends BookData> S save(S entity) {
        return null;
    }

    @Override
    public <S extends BookData> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<BookData> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<BookData> findAll() {
        return null;
    }

    @Override
    public List<BookData> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(BookData entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends BookData> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<BookData> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<BookData> findAll(Pageable pageable) {
        return null;
    }
}
