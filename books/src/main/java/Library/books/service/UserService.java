package Library.books.service;

import Library.books.data.UserData;
import Library.books.repository.UserRepo;
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
public class UserService implements UserRepo {
    @Override
    public String saveUser(UserData userData) {
        return null;
    }




















    @Override
    public void flush() {

    }

    @Override
    public <S extends UserData> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UserData> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<UserData> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserData getOne(Long aLong) {
        return null;
    }

    @Override
    public UserData getById(Long aLong) {
        return null;
    }

    @Override
    public UserData getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends UserData> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserData> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UserData> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UserData> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserData> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserData> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UserData, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends UserData> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UserData> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UserData> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<UserData> findAll() {
        return null;
    }

    @Override
    public List<UserData> findAllById(Iterable<Long> longs) {
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
    public void delete(UserData entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserData> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<UserData> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UserData> findAll(Pageable pageable) {
        return null;
    }
}











